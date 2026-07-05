package defpackage;

import android.os.ParcelFileDescriptor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ip8  reason: default package */
/* loaded from: classes.dex */
public interface ip8 extends AutoCloseable {
    void A(ParcelFileDescriptor parcelFileDescriptor, boolean z);

    kq8 F(int i, boolean z);

    default Object L(int i, xt4 xt4Var) {
        kq8 kq8Var;
        try {
            kq8Var = F(i, false);
            try {
                Object invoke = xt4Var.invoke(kq8Var);
                U(i, kq8Var);
                return invoke;
            } catch (Throwable th) {
                th = th;
                U(i, kq8Var);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kq8Var = null;
        }
    }

    void U(int i, kq8 kq8Var);

    int h();

    int h0();

    int i();
}
