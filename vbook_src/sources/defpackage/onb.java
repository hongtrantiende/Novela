package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: onb  reason: default package */
/* loaded from: classes3.dex */
public final class onb extends nf8 {
    public final String a;
    public final e32 b;
    public final byte[] c;

    public onb(String str, e32 e32Var) {
        str.getClass();
        e32Var.getClass();
        this.a = str;
        this.b = e32Var;
        Charset a = h32.a(e32Var);
        this.c = fre.t(str, a == null ? ed1.a : a);
    }

    @Override // defpackage.rf8
    public final Long a() {
        return Long.valueOf(this.c.length);
    }

    @Override // defpackage.rf8
    public final e32 b() {
        return this.b;
    }

    @Override // defpackage.rf8
    public final ii5 d() {
        return null;
    }

    @Override // defpackage.nf8
    public final byte[] e() {
        return this.c;
    }

    public final String toString() {
        return "TextContent[" + this.b + "] \"" + k4b.L0(30, this.a) + '\"';
    }
}
