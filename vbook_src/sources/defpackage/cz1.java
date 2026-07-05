package defpackage;

import java.io.IOException;
import java.net.ConnectException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cz1  reason: default package */
/* loaded from: classes.dex */
public final class cz1 extends ConnectException {
    public final IOException a;

    public cz1(String str, IOException iOException) {
        super(str);
        this.a = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
