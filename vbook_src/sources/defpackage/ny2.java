package defpackage;

import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ny2  reason: default package */
/* loaded from: classes3.dex */
public final class ny2 extends pf8 {
    public final /* synthetic */ int a = 1;
    public final Long b;
    public final e32 c;
    public final /* synthetic */ Object d;

    public ny2(qv8 qv8Var, e32 e32Var, Object obj) {
        Long l;
        this.d = obj;
        String v = ((gh5) qv8Var.a).c.v("Content-Length");
        if (v != null) {
            l = Long.valueOf(Long.parseLong(v));
        } else {
            l = null;
        }
        this.b = l;
        if (e32Var == null) {
            e32 e32Var2 = a32.a;
            e32Var = a32.b;
        }
        this.c = e32Var;
    }

    @Override // defpackage.rf8
    public final Long a() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.rf8
    public final e32 b() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.pf8
    public final s11 e() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (s11) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                sw2 sw2Var = ab3.a;
                ru2 ru2Var = ru2.c;
                r01 r01Var = s01.a;
                inputStream.getClass();
                ru2Var.getClass();
                r01Var.getClass();
                int i2 = w56.a;
                return new kh9(new n21(inputStream), ru2Var);
        }
    }

    public ny2(gh5 gh5Var, e32 e32Var, Object obj) {
        this.d = obj;
        String v = gh5Var.c.v("Content-Length");
        this.b = v != null ? Long.valueOf(Long.parseLong(v)) : null;
        if (e32Var == null) {
            e32 e32Var2 = a32.a;
            e32Var = a32.b;
        }
        this.c = e32Var;
    }
}
