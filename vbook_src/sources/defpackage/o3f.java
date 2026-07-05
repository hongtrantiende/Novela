package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o3f  reason: default package */
/* loaded from: classes.dex */
public final class o3f extends o0e {
    private static final o3f zze;
    private static volatile f2e zzf;
    private r1e zzb = r1e.b;

    static {
        o3f o3fVar = new o3f();
        zze = o3fVar;
        o0e.o(o3f.class, o3fVar);
    }

    public static o3f u() {
        return zze;
    }

    @Override // defpackage.o0e
    public final Object s(int i) {
        f2e f2eVar;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 6) {
                                f2e f2eVar2 = zzf;
                                if (f2eVar2 == null) {
                                    synchronized (o3f.class) {
                                        try {
                                            f2eVar = zzf;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zze);
                                                zzf = f2eVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return f2eVar;
                                }
                                return f2eVar2;
                            }
                            throw null;
                        }
                        return zze;
                    }
                    return new m0e(zze);
                }
                return new o3f();
            }
            return new k2e(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", i3f.a});
        }
        return (byte) 1;
    }

    public final g3f t(String str, g3f g3fVar) {
        str.getClass();
        g3f g3fVar2 = (g3f) this.zzb.get(str);
        if (g3fVar2 != null) {
            return g3fVar2;
        }
        return g3fVar;
    }

    public final r1e v() {
        r1e r1eVar = this.zzb;
        if (!r1eVar.a) {
            this.zzb = r1eVar.a();
        }
        return this.zzb;
    }
}
