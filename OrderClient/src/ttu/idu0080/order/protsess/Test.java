package ttu.idu0080.order.protsess;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import java.time.LocalDate;

import ttu.idu0080.order.server.Courier;
import ttu.idu0080.order.server.EntAddress;
import ttu.idu0080.order.server.Order;
import ttu.idu0080.order.teenus.Pakkumine;

public class Test {

	public static void main(String[] args) {
		OrderProtsess op = new OrderProtsess();
		Order order = op.getOrderById(1);
		System.out.println(order.getPriceTotal());
		System.out.println("---------------");
		List<Courier> couriers = op.getCourierList();
		List<Pakkumine> pakkumised = new ArrayList<Pakkumine>();
		for (Courier courier : couriers) {
			pakkumised.add(op.getBestOffer(courier.getEnterprise(), order));
			// System.out.println(courier.getName() + " - percent: "+
			// courier.getPercentFromOrder());
		}
		// Courier courier = op.getBestOffer(order, order);
		// System.out.println("Best: " + courier.getName() + " - percent: "+
		// courier.getPercentFromOrder());
		float headus = (float) ((pakkumised.get(0).getPrice() - order.getPriceTotal()) * 0.01
				* pakkumised.get(0).getDeliveryTime());
		Pakkumine parimPakkumine = pakkumised.get(0);
		Courier parimCourier = couriers.get(0);
		for (Courier courier : couriers) {
			for (Pakkumine pakkumine : pakkumised) {
				if ((float) ((pakkumine.getPrice() - order.getPriceTotal()) * 0.01
						* pakkumine.getDeliveryTime()) < headus) {
					headus = (float) ((pakkumine.getPrice() - order.getPriceTotal()) * 0.01
							* pakkumine.getDeliveryTime());
					parimPakkumine = pakkumine;
					parimCourier = courier;
				}
			}
		}
		System.out.println("--------------------");
		System.out.println("Parim Pakkumine");
		System.out.println(parimCourier.getName() + "  |  " + parimPakkumine.getOfferId() + "  |  "
				+ parimPakkumine.getPrice() + "  |  " + parimPakkumine.getDeliveryTime());
		System.out.println("--------------------");
		System.out.println("Tracking Number");
		String trackingNr = op.generateTrackingNumber(parimPakkumine.getOfferId());
		System.out.println(trackingNr);

		Date date = new Date();
		System.out.println(date);
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, parimPakkumine.getDeliveryTime());
		try {
			XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			op.insertShipment(order.getOrderId(), "1", trackingNr, parimCourier.getName(), date2,
					parimPakkumine.getPrice() - order.getPriceTotal());
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}

	}

}
