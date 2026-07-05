package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y53  reason: default package */
/* loaded from: classes.dex */
public final class y53 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        bdd bddVar;
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(nae.e);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(nae.e);
                return;
            case 2:
                if ((view instanceof bdd) && (outline2 = (bddVar = (bdd) view).e) != null) {
                    outline.set(outline2);
                    float f = bddVar.G;
                    if (f != nae.e || bddVar.H != nae.e) {
                        outline.offset((int) f, (int) bddVar.H);
                        return;
                    }
                    return;
                }
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
