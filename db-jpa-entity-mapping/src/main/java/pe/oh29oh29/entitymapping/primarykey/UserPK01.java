package pe.oh29oh29.entitymapping.primarykey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserPK01 {

    /**
     * 기본 키 직접 할당 전략
     *
     * 기본 키를 직접 할당하려면 @Id로 매핑
     * em.persist()로 엔티티를 저장하기 전에 애플리케이션에서 기본 키를 직접 할당하는 방법
     *
     * 적용 가능 자바 타입
     * - 기본형
     * - Wrapper형
     * - String
     * - java.util.Date
     * - java.sql.Date
     * - java.math.BigDecimal
     * - java.math.BigInteger
     * */
    @Id
    private String id;

    public void setId(String id) {
        this.id = id;
    }
}
