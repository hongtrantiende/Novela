package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c97  reason: default package */
/* loaded from: classes.dex */
public final class c97 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y67 b;

    public /* synthetic */ c97(y67 y67Var, int i) {
        this.a = i;
        this.b = y67Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        y67 y67Var = this.b;
        switch (i) {
            case 0:
                Member member = (Member) obj;
                member.getClass();
                dc7 dc7Var = new dc7((Method) member);
                Object obj2 = y67Var.b;
                if (obj2 != null) {
                    dc7Var.A(obj2);
                }
                return dc7Var;
            case 1:
                Member member2 = (Member) obj;
                member2.getClass();
                e12 e12Var = new e12((Constructor) member2);
                Object obj3 = y67Var.b;
                return e12Var;
            case 2:
                Member member3 = (Member) obj;
                member3.getClass();
                dc4 dc4Var = new dc4((Field) member3);
                Object obj4 = y67Var.b;
                if (obj4 != null) {
                    dc4Var.A(obj4);
                }
                return dc4Var;
            case 3:
                Member member4 = (Member) obj;
                member4.getClass();
                dc7 dc7Var2 = new dc7((Method) member4);
                Object obj5 = y67Var.b;
                if (obj5 != null) {
                    dc7Var2.A(obj5);
                }
                return dc7Var2;
            case 4:
                Member member5 = (Member) obj;
                member5.getClass();
                e12 e12Var2 = new e12((Constructor) member5);
                Object obj6 = y67Var.b;
                return e12Var2;
            default:
                Member member6 = (Member) obj;
                member6.getClass();
                dc4 dc4Var2 = new dc4((Field) member6);
                Object obj7 = y67Var.b;
                if (obj7 != null) {
                    dc4Var2.A(obj7);
                }
                return dc4Var2;
        }
    }
}
