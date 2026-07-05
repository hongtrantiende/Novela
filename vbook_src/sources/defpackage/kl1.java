package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kl1  reason: default package */
/* loaded from: classes.dex */
public final class kl1 implements n8c {
    public final io5 a;

    public kl1(io5 io5Var) {
        this.a = io5Var;
    }

    @Override // defpackage.n8c
    public final l8c a(String str, tl0 tl0Var, String str2, wn5 wn5Var) {
        wn5Var.getClass();
        Bitmap bitmap = tl0Var.a;
        tj9 d = ((rj9) this.a).d();
        if (d != null) {
            d.c(new h97(str), new i97(new ql0(bitmap), ls3.a));
        }
        return null;
    }

    @Override // defpackage.n8c
    public final l8c b(String str) {
        i97 a;
        tj9 d = ((rj9) this.a).d();
        if (d != null && (a = d.a(new h97(str))) != null) {
            ml5 ml5Var = a.a;
            ml5Var.getClass();
            return new tl0(((ql0) ml5Var).a);
        }
        return null;
    }
}
