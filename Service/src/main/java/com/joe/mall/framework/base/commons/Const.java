package com.joe.mall.framework.base.commons;

import jdk.net.SocketFlow;

public class Const {

    public enum DealPublistStatusConst {
        DEAL_PUBLISH_STATUS_NEW("新建商品", 0),
        DEAL_PUBLISH_STATUS_AUDITED("已审核商品", 1),
        DEAL_PUBLISH_STATUS_PUBLISH("已发布商品", 3),
        DEAL_PUBLISH_STATUS_DELETED("已删除商品", 4);
        private String status;
        private int code;

        DealPublistStatusConst(String status, int code) {
            this.status = status;
            this.code = code;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
}
