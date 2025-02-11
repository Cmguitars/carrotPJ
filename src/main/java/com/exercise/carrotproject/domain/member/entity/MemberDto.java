package com.exercise.carrotproject.domain.member.entity;


import com.exercise.carrotproject.domain.common.entity.BaseEntity;
import com.exercise.carrotproject.domain.converter.LocAttributeConverter;
import com.exercise.carrotproject.domain.enumList.Loc;
import com.exercise.carrotproject.domain.review.entity.ReviewBuyer;
import com.exercise.carrotproject.domain.review.entity.ReviewSeller;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString (exclude = {"blockfromMemList", "blocktoMemList", "reviewBuyerList", "reviewSellerList"})
public class MemberDto extends BaseEntity {
    private String memId;
    private String memPwd;
    private String nickname;
    private String profPath;
    private Double mannerScore;
    private Loc loc;

    //Block테이블
    private List<Block> blockfromMemList = new ArrayList<>();
    private List<Block> blocktoMemList = new ArrayList<>();

    //reviewBuyer 테이블
    private List<ReviewBuyer> reviewBuyerList = new ArrayList<>();
    //reviewSeller 테이블
    private List<ReviewSeller> reviewSellerList = new ArrayList<>();

}
