package blockChainHW3_120191212;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author abdQaddora
 */
public interface RemoteInterface extends Remote{
    public void addBlock(Block block) throws RemoteException;
    public ChainLink getCurrentChain() throws RemoteException;
}
