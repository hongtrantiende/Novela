package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k4d  reason: default package */
/* loaded from: classes.dex */
public abstract class k4d {
    public static final /* synthetic */ int a = 0;

    static {
        int i = zl1.j;
    }

    public static final List a(String str) {
        if (str != null) {
            s26 s26Var = new s26(11);
            ArrayList arrayList = (ArrayList) s26Var.b;
            if (arrayList == null) {
                arrayList = new ArrayList();
                s26Var.b = arrayList;
            } else {
                arrayList.clear();
            }
            s26Var.I(str, arrayList);
            ArrayList arrayList2 = (ArrayList) s26Var.b;
            if (arrayList2 != null) {
                return arrayList2;
            }
        }
        return ks3.a;
    }
}
