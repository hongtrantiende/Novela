package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import java.io.IOException;
import java.net.SocketTimeoutException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ni5  reason: default package */
/* loaded from: classes3.dex */
public abstract class ni5 {
    public static final pw6 a = sw6.b("io.ktor.client.plugins.HttpTimeout");
    public static final ij1 b;

    static {
        mi5 mi5Var = mi5.D;
        tn4 tn4Var = new tn4(29);
        mi5Var.getClass();
        b = new ij1("HttpTimeout", mi5Var, tn4Var);
    }

    public static final SocketTimeoutException a(oe4 oe4Var, IOException iOException) {
        Object obj;
        oe4Var.getClass();
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append((vyc) oe4Var.b);
        sb.append(", socket_timeout=");
        li5 li5Var = (li5) oe4Var.b();
        if (li5Var == null || (obj = li5Var.c) == null) {
            obj = NetworkResponseData.UNKNOWN_CONTENT_TYPE;
        }
        sb.append(obj);
        sb.append("] ms");
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(sb.toString());
        socketTimeoutException.initCause(iOException);
        return socketTimeoutException;
    }
}
