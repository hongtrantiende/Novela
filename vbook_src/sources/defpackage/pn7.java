package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pn7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ pn7(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        int i3 = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((lu4) obj).invoke(Integer.valueOf(i3 - 1), Integer.valueOf(i2));
                return pvcVar;
            case 1:
                ((lu4) obj).invoke(Integer.valueOf(i3 + 1), Integer.valueOf(i2));
                return pvcVar;
            case 2:
                ((lu4) obj).invoke(Integer.valueOf(i3), Integer.valueOf(i2 - 1));
                return pvcVar;
            case 3:
                ((lu4) obj).invoke(Integer.valueOf(i3), Integer.valueOf(i2 + 1));
                return pvcVar;
            default:
                Http2Connection http2Connection = (Http2Connection) obj;
                try {
                    http2Connection.S.S(i3, i2, true);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.o(errorCode, errorCode, e);
                }
                return pvcVar;
        }
    }
}
