package defpackage;

import android.content.ClipData;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wf  reason: default package */
/* loaded from: classes.dex */
public final class wf implements pj1 {
    public final kw5 a;

    public wf(kw5 kw5Var) {
        this.a = kw5Var;
    }

    public final void a(nj1 nj1Var) {
        kw5 kw5Var = this.a;
        if (nj1Var == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                ru.e(kw5Var.p());
                return;
            } else {
                kw5Var.p().setPrimaryClip(ClipData.newPlainText("", ""));
                return;
            }
        }
        kw5Var.p().setPrimaryClip(nj1Var.a);
    }
}
