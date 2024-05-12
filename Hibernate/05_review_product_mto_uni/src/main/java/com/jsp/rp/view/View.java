package com.jsp.rp.view;

import java.util.Scanner;

import javax.sound.midi.MidiChannel;

import com.jsp.rp.controller.Controller;
import com.qsp.rp.model.Product;
import com.qsp.rp.model.Review;

public class View {
	static Controller controller=new Controller();
	public static void main(String[] args) {
		 Scanner myInput=new Scanner(System.in);
		
		boolean flag=true;
		do {
			System.out.println("1.Insert\n2.Read\n3.Update\n4.Delete\n0.Exit");
			System.out.print("Enter your choice:");
			byte userChoice=myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				System.out.println("Exited From System...");
				flag=false;
				break;
			case 1:
//				at one time we insert one review for on product
				Product product=new Product();
				System.out.print("Enter Product ID:");
				int product_id=myInput.nextInt();
				myInput.nextLine();
				System.out.print("Enter Product Name:");
				String product_name=myInput.nextLine();
				System.out.print("Enter Product Cost:");
				double product_cost=myInput.nextDouble();
				myInput.nextLine();
				
				product.setId(product_id);
				product.setName(product_name);
				product.setCost(product_cost);
				
				Review review=new Review();
				System.out.print("Enter Review ID:");
				int review_id=myInput.nextInt();
				myInput.nextLine();
				System.out.print("Enter Review Heading:");
				String review_heading=myInput.nextLine();
				System.out.print("Enter Review Comment:");
				String review_comment=myInput.nextLine();
				
				review.setId(review_id);
				review.setHeading(review_heading);
				review.setComment(review_comment);
				
				review.setProduct(product);
				
				boolean insertProductAndReview = controller.insertProductAndReview(product, review);
				if (insertProductAndReview) {
					System.out.println("Product and its respective reviews inserted.Insertion operation performed");
				} else {
					System.out.println("Product and its respective reviews not inserted.Insertion operation performed.");
				}
//				System.out.println("What do you want to insert:\n1.Product\n2.Review");
//				byte insertChoice=myInput.nextByte();
//				myInput.nextLine();
//				Product product=new Product();
//				Review review=new Review();
//				if (insertChoice==1) {
////					Product product=new Product();
//					System.out.println("Enter Product ID:");
//					int product_id=myInput.nextInt();
//					myInput.nextLine();
//					System.out.println("Enter Product Name:");
//					String product_name=myInput.nextLine();
//					System.out.println("Enter Product Cost:");
//					double product_cost=myInput.nextDouble();
//					myInput.nextLine();
//					
//					product.setId(product_id);
//					product.setName(product_name);
//					product.setCost(product_cost);
//					if (controller.insertProduct(product)) {
//						System.out.println("Product got Inserted.");
//					} else {
//						System.out.println("Product does not get Inserted.");
//					}
//					
//				} else if (insertChoice==2) {
////					Review review=new Review();
//					System.out.println("Enter Review ID:");
//					int review_id=myInput.nextInt();
//					myInput.nextLine();
//					System.out.println("Enter Review Heading");
//					String review_heading=myInput.nextLine();
//					System.out.println("Enter Review Comment:");
//					String review_comment=myInput.nextLine();
//					
//					review.setId(review_id);
//					review.setHeading(review_heading);
//					review.setComment(review_comment);
//					
//					review.setProduct(product);		
//					if (controller.insertReview(review)) {
//						System.out.println("review Got Inserted");
//					} else {
//						System.out.println("Review not got inserted");
//					}
//					
//				}
//				else{
//					System.out.println("Invalid Choice!!!");
//				}
				break;
			case 2:
				System.out.print("Enter Review ID to fetch Review and its respective Product details:");
				int review_id_to_find_review_product=myInput.nextInt();
				myInput.nextLine();
				Review reviewAndProductDetail = controller.findReviewAndProductDetail(review_id_to_find_review_product);
				if (reviewAndProductDetail!=null) {
					System.out.println("Review ID:"+reviewAndProductDetail.getId());
					System.out.println("Heading:"+reviewAndProductDetail.getHeading());
					System.out.println("Comment:"+reviewAndProductDetail.getComment());
					System.out.println("Product Details for product ID="+reviewAndProductDetail.getProduct().getId());
					Product product_to_find = reviewAndProductDetail.getProduct();
					System.out.println("Product ID:"+product_to_find.getId());
					System.out.println("Name:"+product_to_find.getName());
					System.out.println("Cost:"+product_to_find.getCost());
				} else {
					System.out.println("Review ID Does Not Exists");
				}
				break;
				
			case 3:
//				Product update karna:is not appropriate;Product is fixed
				System.out.print("What Do you Want to Update:\n1.Heading\n2.Comment\nEnter Your Choice: ");
				byte updateChoice=myInput.nextByte();
				myInput.nextLine();
				if (updateChoice==1) {
					System.out.print("Enter Review ID to Update:");
					int review_id_to_update=myInput.nextInt();
					myInput.nextLine();
					System.out.print("Enter Review Heading to Update:");
					Object review_heading_to_update=myInput.nextLine();
					boolean updateReviewCommentByReviewID = controller.updateReviewCommentByReviewID(review_id_to_update,review_heading_to_update,updateChoice);
					if (updateReviewCommentByReviewID) {
						System.out.println("Update Operation for Heading Performed.");
					} else {
						System.out.println("Update Operation for Heading Not Performed.");
					}
				} else if (updateChoice==2) {
					System.out.print("Enter Review ID to Update:");
					int review_id_to_update=myInput.nextInt();
					myInput.nextLine();
					System.out.print("Enter Review Comment to Update:");
					Object review_comment_to_update=myInput.nextLine();
					 boolean updateReviewCommentByReviewID = controller.updateReviewCommentByReviewID(review_id_to_update,review_comment_to_update,updateChoice);
					if (updateReviewCommentByReviewID) {
						System.out.println("Update Operation for Comment Performed.");
					} else {
						System.out.println("Update Operation for Comment Not Performed.");
					}
				}
				else{
					System.out.println("Invalid Choice!!!");
				}
				break;
			case 4:
				System.out.print("Enter Review ID for Deletion of Review:");
				int review_id_to_delete=myInput.nextInt();
				myInput.nextLine();
				boolean deleteReviewByReviewId = controller.deleteReviewByReviewId(review_id_to_delete);
				if (deleteReviewByReviewId) {
					System.out.println("Deleterd");
				} else {
					System.out.println("Not Deleted");
				}
				break;

			default:
				System.out.println("Invalid Choice..");
				break;
			}
		} while (flag);

	}

}
