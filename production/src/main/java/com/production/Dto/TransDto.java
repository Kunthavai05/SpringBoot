package com.production.Dto;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TransDto {
	private UUID id;
	private UUID productId;
	private Date transDate;
	private Integer quantity;
	private String status;

}
