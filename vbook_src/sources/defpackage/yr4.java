package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yr4  reason: default package */
/* loaded from: classes.dex */
public final class yr4 implements LayoutInflater.Factory2 {
    public final hs4 a;

    public yr4(hs4 hs4Var) {
        this.a = hs4Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        rr4 rr4Var;
        ur4 ur4Var;
        ns4 g;
        int i;
        ur4 ur4Var2;
        boolean equals = wr4.class.getName().equals(str);
        hs4 hs4Var = this.a;
        if (equals) {
            return new wr4(context, attributeSet, hs4Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bg9.a);
            int i2 = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = rr4.class.isAssignableFrom(bs4.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    if (view != null) {
                        i2 = view.getId();
                    }
                    if (i2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        rr4Var = hs4Var.C(resourceId);
                    } else {
                        rr4Var = null;
                    }
                    if (rr4Var == null && string != null) {
                        rr4Var = hs4Var.D(string);
                    }
                    if (rr4Var == null && i2 != -1) {
                        rr4Var = hs4Var.C(i2);
                    }
                    if (rr4Var == null) {
                        bs4 H = hs4Var.H();
                        context.getClassLoader();
                        rr4Var = H.a(attributeValue);
                        rr4Var.J = true;
                        if (resourceId != 0) {
                            i = resourceId;
                        } else {
                            i = i2;
                        }
                        rr4Var.T = i;
                        rr4Var.U = i2;
                        rr4Var.V = string;
                        rr4Var.K = true;
                        rr4Var.P = hs4Var;
                        tr4 tr4Var = hs4Var.w;
                        rr4Var.Q = tr4Var;
                        ur4 ur4Var3 = tr4Var.d;
                        rr4Var.a0 = true;
                        if (tr4Var == null) {
                            ur4Var2 = null;
                        } else {
                            ur4Var2 = tr4Var.c;
                        }
                        if (ur4Var2 != null) {
                            rr4Var.a0 = true;
                        }
                        g = hs4Var.a(rr4Var);
                        if (hs4.K(2)) {
                            Log.v("FragmentManager", "Fragment " + rr4Var + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!rr4Var.K) {
                        rr4Var.K = true;
                        rr4Var.P = hs4Var;
                        tr4 tr4Var2 = hs4Var.w;
                        rr4Var.Q = tr4Var2;
                        ur4 ur4Var4 = tr4Var2.d;
                        rr4Var.a0 = true;
                        if (tr4Var2 == null) {
                            ur4Var = null;
                        } else {
                            ur4Var = tr4Var2.c;
                        }
                        if (ur4Var != null) {
                            rr4Var.a0 = true;
                        }
                        g = hs4Var.g(rr4Var);
                        if (hs4.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + rr4Var + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    os4 os4Var = ps4.a;
                    ps4.b(new ls4(rr4Var, "Attempting to use <fragment> tag to add fragment " + rr4Var + " to container " + viewGroup));
                    ps4.a(rr4Var).getClass();
                    rr4Var.b0 = viewGroup;
                    g.j();
                    g.i();
                    vs.k(hl5.n("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
