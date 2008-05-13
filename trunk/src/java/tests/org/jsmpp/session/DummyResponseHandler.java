package org.jsmpp.session;

import java.io.IOException;

import org.jsmpp.bean.Bind;
import org.jsmpp.bean.BindType;
import org.jsmpp.bean.CancelSm;
import org.jsmpp.bean.Command;
import org.jsmpp.bean.DataSm;
import org.jsmpp.bean.MessageState;
import org.jsmpp.bean.QuerySm;
import org.jsmpp.bean.SubmitMulti;
import org.jsmpp.bean.SubmitMultiResult;
import org.jsmpp.bean.SubmitSm;
import org.jsmpp.extra.PendingResponse;
import org.jsmpp.extra.ProcessRequestException;
import org.jsmpp.util.MessageId;

/**
 * @author uudashr
 *
 */
class DummyResponseHandler implements ServerResponseHandler {
    private boolean connectionClosed;
    
    public void notifyUnbonded() {
    }

    public PendingResponse<Command> removeSentItem(int sequenceNumber) {
        return null;
    }

    public void sendEnquireLinkResp(int sequenceNumber) throws IOException {
    }

    public void sendGenerickNack(int commandStatus, int sequenceNumber)
            throws IOException {
    }

    public void sendNegativeResponse(int originalCommandId, int commandStatus,
            int sequenceNumber) throws IOException {
        if (connectionClosed) {
            throw new IOException("Connection closed");
        }
    }

    public void sendUnbindResp(int sequenceNumber) throws IOException {
    }
    
    public void processBind(Bind bind) {
    }

    public QuerySmResult processQuerySm(QuerySm querySm)
            throws ProcessRequestException {
        return null;
    }
    
    public SubmitMultiResult processSubmitMulti(SubmitMulti submitMulti)
            throws ProcessRequestException {
        return null;
    }
    
    public void sendSubmitMultiResponse(SubmitMultiResult submiitMultiResult,
            int sequenceNumber) throws IOException {
    }
    
    public MessageId processSubmitSm(SubmitSm submitSm)
            throws ProcessRequestException {
        return null;
    }

    public void sendBindResp(String systemId, BindType bindType, int sequenceNumber)
            throws IOException {
        if (connectionClosed) {
            throw new IOException("Connection closed");
        }
    }

    public void sendSubmitSmResponse(MessageId messageId, int sequenceNumber)
            throws IOException {

    }
    
    public DataSmResult processDataSm(DataSm dataSm)
            throws ProcessRequestException {
        return null;
    }
    
    public void sendDataSmResp(DataSmResult dataSmResult, int sequenceNumber)
            throws IOException {
    }
    
    public void processCancelSm(CancelSm cancelSm)
            throws ProcessRequestException {
    }
    
    public void sendCancelSmResp(int sequenceNumber) throws IOException {
    }
    
    public void sendQuerySmResp(String messageId, String finalDate,
            MessageState messageState, byte errorCode, int sequenceNumber)
            throws IOException {
    }
    
    public void closeConnection() {
        connectionClosed = true;
    }
}