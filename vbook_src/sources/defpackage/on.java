package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: on  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class on implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ on(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        WebSocketWriter webSocketWriter;
        int i;
        switch (this.a) {
            case 0:
                return ((jea) ((hy0) this.c)).c(this.b);
            default:
                RealWebSocket realWebSocket = (RealWebSocket) this.c;
                long j = this.b;
                List list = RealWebSocket.T;
                synchronized (realWebSocket) {
                    try {
                        if (!realWebSocket.Q && (webSocketWriter = realWebSocket.G) != null) {
                            if (realWebSocket.S) {
                                i = realWebSocket.R;
                            } else {
                                i = -1;
                            }
                            realWebSocket.R++;
                            realWebSocket.S = true;
                            if (i != -1) {
                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                sb.append(realWebSocket.c);
                                sb.append("ms (after ");
                                RealWebSocket.j(realWebSocket, new SocketTimeoutException(rs8.g(i - 1, " successful ping/pongs)", sb)), null, 2);
                            } else {
                                try {
                                    e31 e31Var = e31.d;
                                    e31Var.getClass();
                                    webSocketWriter.o(9, e31Var);
                                } catch (IOException e) {
                                    RealWebSocket.j(realWebSocket, e, null, 2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j);
        }
    }
}
