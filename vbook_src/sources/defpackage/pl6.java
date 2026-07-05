package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pl6  reason: default package */
/* loaded from: classes.dex */
public final class pl6 implements ay8 {
    public final View a;
    public final kw5 b;
    public ol6 e;
    public gtb f;
    public ucd g;
    public Rect l;
    public final dl6 m;
    public xt4 c = new vb6(10);
    public xt4 d = new vb6(11);
    public jub h = new jub("", fxb.b, 4);
    public as5 i = as5.g;
    public final ArrayList j = new ArrayList();
    public final ye6 k = ipe.x(sk6.c, new u76(this, 3));

    public pl6(View view, nj njVar, kw5 kw5Var) {
        this.a = view;
        this.b = kw5Var;
        this.m = new dl6(njVar, kw5Var);
    }

    @Override // defpackage.ay8
    public final InputConnection a(EditorInfo editorInfo) {
        jub jubVar = this.h;
        mwe.y(editorInfo, jubVar.a.b, jubVar.b, this.i);
        ll6 ll6Var = ml6.a;
        if (cq3.d()) {
            cq3.a().i(editorInfo);
        }
        nk9 nk9Var = new nk9(this.h, new n07(this, 23), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(nk9Var));
        return nk9Var;
    }
}
