package com.lusiwei.pojo;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.tid
     *
     * @mbg.generated
     */
    private Integer tid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.tname
     *
     * @mbg.generated
     */
    private String tname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.tid
     *
     * @return the value of teacher.tid
     *
     * @mbg.generated
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.tid
     *
     * @param tid the value for teacher.tid
     *
     * @mbg.generated
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.tname
     *
     * @return the value of teacher.tname
     *
     * @mbg.generated
     */
    public String getTname() {
        return tname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.tname
     *
     * @param tname the value for teacher.tname
     *
     * @mbg.generated
     */
    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }
}