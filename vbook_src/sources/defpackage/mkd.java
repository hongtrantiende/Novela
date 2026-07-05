package defpackage;

import android.os.Build;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mkd  reason: default package */
/* loaded from: classes.dex */
public final class mkd implements lkd {
    public final s13 b;

    public mkd() {
        s13 s13Var;
        if (Build.VERSION.SDK_INT >= 34) {
            s13Var = t13.a;
        } else {
            s13Var = r0f.G;
        }
        this.b = s13Var;
        tl1.m(1, 2, 4, 8, 16, 32, 64, Integer.valueOf((int) Token.CASE));
    }
}
