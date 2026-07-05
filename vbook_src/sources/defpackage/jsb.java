package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jsb  reason: default package */
/* loaded from: classes.dex */
public final class jsb extends kza {
    public CharSequence c;
    public List d;
    public fxb e;
    public oyb f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public tc6 k;
    public do4 l;
    public long m;
    public fvb n;

    public jsb() {
        super(dra.j().g());
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.m = y02.b(0, 0, 0, 0, 15);
    }

    @Override // defpackage.kza
    public final void a(kza kzaVar) {
        kzaVar.getClass();
        jsb jsbVar = (jsb) kzaVar;
        this.c = jsbVar.c;
        this.d = jsbVar.d;
        this.e = jsbVar.e;
        this.f = jsbVar.f;
        this.g = jsbVar.g;
        this.h = jsbVar.h;
        this.i = jsbVar.i;
        this.j = jsbVar.j;
        this.k = jsbVar.k;
        this.l = jsbVar.l;
        this.m = jsbVar.m;
        this.n = jsbVar.n;
    }

    @Override // defpackage.kza
    public final kza b() {
        return new jsb();
    }

    public final String toString() {
        CharSequence charSequence = this.c;
        List list = this.d;
        fxb fxbVar = this.e;
        oyb oybVar = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        float f = this.i;
        float f2 = this.j;
        tc6 tc6Var = this.k;
        do4 do4Var = this.l;
        String m = x02.m(this.m);
        fvb fvbVar = this.n;
        StringBuilder sb = new StringBuilder("CacheRecord(visualText=");
        sb.append((Object) charSequence);
        sb.append(", annotations=");
        sb.append(list);
        sb.append(", composition=");
        sb.append(fxbVar);
        sb.append(", textStyle=");
        sb.append(oybVar);
        sb.append(", singleLine=");
        rs8.z(sb, z, ", softWrap=", z2, ", densityValue=");
        s21.D(sb, f, ", fontScale=", f2, ", layoutDirection=");
        sb.append(tc6Var);
        sb.append(", fontFamilyResolver=");
        sb.append(do4Var);
        sb.append(", constraints=");
        sb.append(m);
        sb.append(", layoutResult=");
        sb.append(fvbVar);
        sb.append(")");
        return sb.toString();
    }
}
