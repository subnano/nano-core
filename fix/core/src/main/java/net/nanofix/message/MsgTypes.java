package net.nanofix.message;

/**
 * User: Mark
 * Date: 13/04/12
 * Time: 11:24
 */
public final class MsgTypes {

    public static MsgType Logon = new MsgType("A", "Logon");
    public static MsgType Heartbeat = new MsgType("0", "HeartBeat");
    public static MsgType TestRequest = new MsgType("1", "TestRequest");
    public static MsgType ResendRequest = new MsgType("2");
    public static MsgType Reject = new MsgType("3");
    public static MsgType SequenceReset = new MsgType("4");
    public static MsgType Logout = new MsgType("5");
    public static MsgType BusinessMessageReject = new MsgType("j");
    public static MsgType UserRequest = new MsgType("BE");
    public static MsgType UserResponse = new MsgType("BF");
    public static MsgType Advertisement = new MsgType("7");
    public static MsgType IndicationOfInterest = new MsgType("6");
    public static MsgType News = new MsgType("B");
    public static MsgType Email = new MsgType("C");
    public static MsgType QuoteRequest = new MsgType("R");
    public static MsgType QuoteResponse = new MsgType("AJ");
    public static MsgType QuoteRequestReject = new MsgType("AG");
    public static MsgType RFQRequest = new MsgType("AH");
    public static MsgType Quote = new MsgType("S");
    public static MsgType QuoteCancel = new MsgType("Z");
    public static MsgType QuoteStatusRequest = new MsgType("a");
    public static MsgType QuoteStatusReport = new MsgType("AI");
    public static MsgType MassQuote = new MsgType("i");
    public static MsgType MassQuoteAcknowledgement = new MsgType("b");
    public static MsgType MarketDataRequest = new MsgType("V");
    public static MsgType MarketDataSnapshotFullRefresh = new MsgType("W");
    public static MsgType MarketDataIncrementalRefresh = new MsgType("X");
    public static MsgType MarketDataRequestReject = new MsgType("Y");
    public static MsgType SecurityDefinitionRequest = new MsgType("c");
    public static MsgType SecurityDefinition = new MsgType("d");
    public static MsgType SecurityTypeRequest = new MsgType("v");
    public static MsgType SecurityTypes = new MsgType("w");
    public static MsgType SecurityListRequest = new MsgType("x");
    public static MsgType SecurityList = new MsgType("y");
    public static MsgType DerivativeSecurityListRequest = new MsgType("z");
    public static MsgType DerivativeSecurityList = new MsgType("AA");
    public static MsgType SecurityStatusRequest = new MsgType("e");
    public static MsgType SecurityStatus = new MsgType("f");
    public static MsgType TradingSessionStatusRequest = new MsgType("g");
    public static MsgType TradingSessionStatus = new MsgType("h");
    public static MsgType NewOrderSingle = new MsgType("D");
    public static MsgType ExecutionReport = new MsgType("8");
    public static MsgType DontKnowTrade = new MsgType("Q");
    public static MsgType OrderCancelReplaceRequest = new MsgType("G");
    public static MsgType OrderCancelRequest = new MsgType("F");
    public static MsgType OrderCancelReject = new MsgType("9");
    public static MsgType OrderStatusRequest = new MsgType("H");
    public static MsgType OrderMassCancelRequest = new MsgType("q");
    public static MsgType OrderMassCancelReport = new MsgType("r");
    public static MsgType OrderMassStatusRequest = new MsgType("AF");
    public static MsgType NewOrderCross = new MsgType("s");
    public static MsgType CrossOrderCancelReplaceRequest = new MsgType("t");
    public static MsgType CrossOrderCancelRequest = new MsgType("u");
    public static MsgType NewOrderMultileg = new MsgType("AB");
    public static MsgType MultilegOrderCancelReplaceRequest = new MsgType("AC");
    public static MsgType BidRequest = new MsgType("k");
    public static MsgType BidResponse = new MsgType("l");
    public static MsgType NewOrderList = new MsgType("E");
    public static MsgType ListStrikePrice = new MsgType("m");
    public static MsgType ListStatus = new MsgType("N");
    public static MsgType ListExecute = new MsgType("L");
    public static MsgType ListCancelRequest = new MsgType("K");
    public static MsgType ListStatusRequest = new MsgType("M");
    public static MsgType AllocationInstruction = new MsgType("J");
    public static MsgType AllocationInstructionAck = new MsgType("P");
    public static MsgType AllocationReport = new MsgType("AS");
    public static MsgType AllocationReportAck = new MsgType("AT");
    public static MsgType Confirmation = new MsgType("AK");
    public static MsgType ConfirmationAck = new MsgType("AU");
    public static MsgType ConfirmationRequest = new MsgType("BH");
    public static MsgType SettlementInstructions = new MsgType("T");
    public static MsgType SettlementInstructionRequest = new MsgType("AV");
    public static MsgType TradeCaptureReportRequest = new MsgType("AD");
    public static MsgType TradeCaptureReportRequestAck = new MsgType("AQ");
    public static MsgType TradeCaptureReport = new MsgType("AE");
    public static MsgType TradeCaptureReportAck = new MsgType("AR");
    public static MsgType RegistrationInstructions = new MsgType("o");
    public static MsgType RegistrationInstructionsResponse = new MsgType("p");
    public static MsgType PositionMaintenanceRequest = new MsgType("AL");
    public static MsgType PositionMaintenanceReport = new MsgType("AM");
    public static MsgType RequestForPositions = new MsgType("AN");
    public static MsgType RequestForPositionsAck = new MsgType("AO");
    public static MsgType PositionReport = new MsgType("AP");
    public static MsgType AssignmentReport = new MsgType("AW");
    public static MsgType CollateralRequest = new MsgType("AX");
    public static MsgType CollateralAssignment = new MsgType("AY");
    public static MsgType CollateralResponse = new MsgType("AZ");
    public static MsgType CollateralReport = new MsgType("BA");
    public static MsgType CollateralInquiry = new MsgType("BB");
    public static MsgType NetworkStatusRequest = new MsgType("BC");
    public static MsgType NetworkStatusResponse = new MsgType("BD");
    public static MsgType CollateralInquiryAck = new MsgType("BG");

}
