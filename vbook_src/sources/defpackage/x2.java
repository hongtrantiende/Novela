package defpackage;

import java.io.OutputStream;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x2  reason: default package */
/* loaded from: classes.dex */
public abstract class x2 {
    protected int memoizedHashCode;

    public abstract int a(j0a j0aVar);

    public abstract void b(fl1 fl1Var);

    public final void c(OutputStream outputStream) {
        int a = ((qw4) this).a(null);
        Logger logger = fl1.f;
        if (a > 4096) {
            a = 4096;
        }
        fl1 fl1Var = new fl1(outputStream, a);
        b(fl1Var);
        if (fl1Var.d > 0) {
            fl1Var.k();
        }
    }
}
