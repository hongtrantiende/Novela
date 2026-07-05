package defpackage;

import java.io.ByteArrayInputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xgf  reason: default package */
/* loaded from: classes.dex */
public final class xgf extends m7e {
    private static final xgf zzc;
    private static volatile k8e zzd;
    private int zze;
    private v7e zzf = l8e.e;

    static {
        xgf xgfVar = new xgf();
        zzc = xgfVar;
        m7e.j(xgf.class, xgfVar);
    }

    public static wgf A() {
        return (wgf) zzc.o();
    }

    public static xgf v(ByteArrayInputStream byteArrayInputStream, g7e g7eVar) {
        m7e g = m7e.g(zzc, new y6e(byteArrayInputStream), g7eVar);
        m7e.l(g);
        return (xgf) g;
    }

    public static xgf w(byte[] bArr, g7e g7eVar) {
        return (xgf) m7e.i(zzc, bArr, g7eVar);
    }

    public static /* synthetic */ void x(xgf xgfVar, int i) {
        xgfVar.zze = i;
    }

    public static void y(xgf xgfVar, vgf vgfVar) {
        v7e v7eVar = xgfVar.zzf;
        if (!((l8e) v7eVar).a) {
            l8e l8eVar = (l8e) v7eVar;
            xgfVar.zzf = l8eVar.b(l8eVar.c << 1);
        }
        ((l8e) xgfVar.zzf).add(vgfVar);
    }

    public final v7e B() {
        return this.zzf;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (tgf.a[i - 1]) {
            case 1:
                return new xgf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", vgf.class});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (xgf.class) {
                        try {
                            k8e k8eVar3 = zzd;
                            k8eVar = k8eVar3;
                            if (k8eVar3 == null) {
                                ?? obj = new Object();
                                zzd = obj;
                                k8eVar = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return k8eVar;
                }
                return k8eVar2;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final int t() {
        return ((l8e) this.zzf).size();
    }

    public final vgf u(int i) {
        return (vgf) ((l8e) this.zzf).get(i);
    }

    public final int z() {
        return this.zze;
    }
}
