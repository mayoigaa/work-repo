export default interface IPassport{
    // 여권번호
    passportid: string,
    // 여권발행국가
    passportcounrty: string,
    // 여권만료일
    passportdate: Date,
    // 회원ID
    memberid: string,
    // 비회원ID
    usernumber: any | null
    // 회원정보
    // 국적
    membercountry : string;
    // 성별은 gender인데... 부끄럽게 
    membersex : string;
    // 생년월일 
    memberdate : Date;


    
}