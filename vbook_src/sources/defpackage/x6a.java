package defpackage;

import android.view.MotionEvent;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x6a  reason: default package */
/* loaded from: classes.dex */
public abstract class x6a {
    public static final h6a a = abf.J;

    public static final boolean a(r09 r09Var) {
        MotionEvent a2;
        List list = r09Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (((z09) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent a3 = r09Var.a();
                if ((a3 == null || !a3.isFromSource(8194)) && ((a2 = r09Var.a()) == null || !a2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
