package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m78  reason: default package */
/* loaded from: classes3.dex */
public final class m78 implements s76 {
    public final Object a;
    public final List b;
    public final ye6 c;

    public m78(Object obj, String str) {
        obj.getClass();
        this.a = obj;
        this.b = ks3.a;
        this.c = ipe.x(sk6.b, new mm7(12, str, this));
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        obj.getClass();
        jbeVar.k(e()).K(e());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a e = e();
        fx1 t = yq2Var.t(e);
        int f = t.f(e());
        if (f == -1) {
            t.n(e);
            return this.a;
        }
        throw new IllegalArgumentException(a82.j(f, "Unexpected index "));
    }

    @Override // defpackage.s76
    public final o9a e() {
        return (o9a) this.c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m78(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.b = asList;
    }
}
