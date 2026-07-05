package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fd3  reason: default package */
/* loaded from: classes.dex */
public final class fd3 extends al6 {
    public final String C;
    public final String e;
    public final String f;

    public fd3(String str, String str2, String str3) {
        str.getClass();
        this.d = str;
        this.e = str;
        this.f = str2;
        this.C = str3;
        j40 e = e();
        e.b("name", str);
        e.b("publicId", str2);
        e.b("systemId", str3);
        if (J("publicId")) {
            e().b("pubSysKey", "PUBLIC");
        } else if (J("systemId")) {
            e().b("pubSysKey", "SYSTEM");
        }
    }

    public final boolean J(String str) {
        String[] strArr = d4b.a;
        return !d4b.e(c(str));
    }

    @Override // defpackage.y28
    public final y28 j() {
        return new fd3(this.e, this.f, this.C);
    }

    @Override // defpackage.y28
    public final String u() {
        return "#doctype";
    }

    @Override // defpackage.y28
    public final void y(bp3 bp3Var, sc3 sc3Var) {
        if (sc3Var.g == rc3.a && !J("publicId") && !J("systemId")) {
            bp3Var.c("<!doctype");
        } else {
            bp3Var.c("<!DOCTYPE");
        }
        if (J("name")) {
            bp3Var.c(" ");
            bp3Var.c(c("name"));
        }
        if (J("pubSysKey")) {
            bp3Var.c(" ");
            bp3Var.c(c("pubSysKey"));
        }
        if (J("publicId")) {
            bp3Var.c(" \"");
            bp3Var.c(c("publicId"));
            bp3Var.b('\"');
        }
        if (J("systemId")) {
            bp3Var.c(" \"");
            bp3Var.c(c("systemId"));
            bp3Var.b('\"');
        }
        bp3Var.b('>');
    }
}
