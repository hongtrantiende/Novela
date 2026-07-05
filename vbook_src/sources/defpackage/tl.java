package defpackage;

import android.app.Activity;
import android.view.Window;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tl  reason: default package */
/* loaded from: classes.dex */
public final class tl {
    public final Activity a;

    public tl(Activity activity) {
        this.a = activity;
    }

    public final void a(boolean z) {
        Window window = this.a.getWindow();
        int i = window.getAttributes().flags;
        if (z) {
            if ((i & Token.CASE) == 0) {
                window.addFlags(Token.CASE);
            }
        } else if ((i & Token.CASE) != 0) {
            window.clearFlags(Token.CASE);
        }
    }

    public final void b(g1a g1aVar) {
        boolean equals = g1aVar.equals(b1a.a);
        Activity activity = this.a;
        if (equals) {
            if (activity.getRequestedOrientation() != -1) {
                activity.setRequestedOrientation(-1);
            }
        } else if (g1aVar.equals(c1a.a)) {
            if (activity.getRequestedOrientation() != 0) {
                activity.setRequestedOrientation(0);
            }
        } else if (g1aVar.equals(d1a.a)) {
            if (activity.getRequestedOrientation() != 8) {
                activity.setRequestedOrientation(8);
            }
        } else if (g1aVar.equals(e1a.a)) {
            if (activity.getRequestedOrientation() != 1) {
                activity.setRequestedOrientation(1);
            }
        } else if (g1aVar.equals(f1a.a)) {
            if (activity.getRequestedOrientation() != 9) {
                activity.setRequestedOrientation(9);
            }
        } else {
            xk5.o();
        }
    }
}
