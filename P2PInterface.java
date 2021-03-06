package blockChainHW3_120191212;

/**
 *
 * @author abdQaddora
 */
public interface P2PInterface {

    /**
     * Send a block to all participants.
     * @param block
     */
    public void broadcastBlock(Block block);

    /**
     * Get the current chain (used by participants that join later).
     * @return
     */
    public ChainLink getCurrentChain();

}
