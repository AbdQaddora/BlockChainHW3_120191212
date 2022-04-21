package blockChainHW3_120191212;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author abdQaddora
 */
public class RemoteHandler extends UnicastRemoteObject implements RemoteInterface {

    private final blockChain sc;

    public RemoteHandler(blockChain sc) throws RemoteException {
        super();
        this.sc = sc;
    }


    @Override
    public void addBlock(Block block) throws RemoteException {
        sc.addBlock(block);
    }

    @Override
    public ChainLink getCurrentChain() throws RemoteException {
        return sc.chain;
    }

}
