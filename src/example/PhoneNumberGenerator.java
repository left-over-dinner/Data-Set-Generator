package example;

import sqlscriptgenerator.Column;

public class PhoneNumberGenerator extends Column {
    private String[] phoneNumberSet = {"819-910-8887","226-676-3423","416-367-8648","226-654-2175","604-869-3001","819-693-8136","905-443-5871","778-221-9815","709-884-4326","519-531-3629","604-518-9013","514-344-1305","905-395-8111","289-866-7903","418-315-3769","905-698-3885","902-521-2788","306-533-4792","780-683-2106","250-668-8683"};
    public PhoneNumberGenerator(String columnName){
        super(columnName);
    }
    @Override
    public String generateValue() {
        return "'"+phoneNumberSet[randomNumber(0, phoneNumberSet.length)]+"'";
    }
}
