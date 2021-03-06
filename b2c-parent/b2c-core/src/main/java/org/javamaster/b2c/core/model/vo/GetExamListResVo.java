package org.javamaster.b2c.core.model.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.javamaster.b2c.core.enums.ExamStatusEnum;
import org.javamaster.b2c.core.enums.ExamTypeEnum;

import java.util.Date;

/**
 * @author yudong
 * @date 2019/6/10
 */
public class GetExamListResVo {
    private String examName;
    private ExamTypeEnum examType;
    private ExamStatusEnum examStatus;
    private Date examOpDate;
    private String examOpUsername;
    private Byte delFlag;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public ExamTypeEnum getExamType() {
        return examType;
    }

    public void setExamType(ExamTypeEnum examType) {
        this.examType = examType;
    }

    public ExamStatusEnum getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(ExamStatusEnum examStatus) {
        this.examStatus = examStatus;
    }

    public Date getExamOpDate() {
        return examOpDate;
    }

    public void setExamOpDate(Date examOpDate) {
        this.examOpDate = examOpDate;
    }

    public String getExamOpUsername() {
        return examOpUsername;
    }

    public void setExamOpUsername(String examOpUsername) {
        this.examOpUsername = examOpUsername;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}
