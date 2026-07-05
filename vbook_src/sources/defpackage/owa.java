package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: owa  reason: default package */
/* loaded from: classes.dex */
public final class owa implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ rwa c;

    public /* synthetic */ owa(rwa rwaVar, View view, int i) {
        this.a = i;
        this.c = rwaVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a;
        View view = this.b;
        rwa rwaVar = this.c;
        switch (i) {
            case 0:
                if (((swa) rwaVar.c).c()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            default:
                if (((swa) ((qwa) rwaVar).c).c()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
