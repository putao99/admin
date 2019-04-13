package com.perye.repository;

import com.perye.domain.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Perye
 * @Date: 2019-04-13
 */
public interface VerificationCodeRepository extends JpaRepository<VerificationCode, Long> {

    /**
     * 获取有效的验证码
     * @param scenes 业务场景，如重置密码，重置邮箱等等
     * @param type
     * @param value
     * @return
     */
    VerificationCode findByScenesAndTypeAndValueAndStatusIsTrue(String scenes, String type, String value);
}
