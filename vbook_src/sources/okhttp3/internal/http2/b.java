package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.PushObserver;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements vt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Http2Connection b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ b(Http2Connection http2Connection, int i, List list) {
        this.b = http2Connection;
        this.c = i;
        this.d = list;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Http2Connection http2Connection = this.b;
                int i = this.c;
                ((PushObserver.Companion.PushObserverCancel) http2Connection.G).getClass();
                try {
                    http2Connection.S.V(i, ErrorCode.CANCEL);
                    synchronized (http2Connection) {
                        http2Connection.U.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return pvc.a;
            default:
                Http2Connection http2Connection2 = this.b;
                int i2 = this.c;
                ((PushObserver.Companion.PushObserverCancel) http2Connection2.G).getClass();
                try {
                    http2Connection2.S.V(i2, ErrorCode.CANCEL);
                    synchronized (http2Connection2) {
                        http2Connection2.U.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return pvc.a;
        }
    }

    public /* synthetic */ b(Http2Connection http2Connection, int i, List list, boolean z) {
        this.b = http2Connection;
        this.c = i;
        this.d = list;
    }
}
