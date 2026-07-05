package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zp9  reason: default package */
/* loaded from: classes.dex */
public final class zp9 implements ThreadFactory {
    public static final /* synthetic */ zp9 b = new zp9(1);
    public final /* synthetic */ int a;

    public /* synthetic */ zp9(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new yp9(runnable);
            default:
                Object obj = a0f.j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
