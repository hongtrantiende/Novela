package defpackage;

import android.util.SparseArray;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jl9  reason: default package */
/* loaded from: classes.dex */
public final class jl9 {
    public SparseArray a;
    public int b;
    public Set c;

    public final il9 a(int i) {
        SparseArray sparseArray = this.a;
        il9 il9Var = (il9) sparseArray.get(i);
        if (il9Var == null) {
            il9 il9Var2 = new il9();
            sparseArray.put(i, il9Var2);
            return il9Var2;
        }
        return il9Var;
    }
}
