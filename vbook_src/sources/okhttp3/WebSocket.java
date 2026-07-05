package okhttp3;

import okhttp3.internal.ws.RealWebSocket;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public interface WebSocket {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface Factory {
        RealWebSocket a(Request request, WebSocketListener webSocketListener);
    }

    boolean a(e31 e31Var);

    boolean b(String str);

    void cancel();

    boolean f(int i, String str);
}
