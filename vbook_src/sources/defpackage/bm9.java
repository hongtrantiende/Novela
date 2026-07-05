package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bm9  reason: default package */
/* loaded from: classes3.dex */
public final class bm9 extends ql1 {
    public final gi1 b;
    public final qz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm9(gi1 gi1Var, s76 s76Var) {
        super(s76Var);
        s76Var.getClass();
        this.b = gi1Var;
        o9a e = s76Var.e();
        e.getClass();
        this.c = new qz(e, 0);
    }

    @Override // defpackage.s76
    public final o9a e() {
        return this.c;
    }

    @Override // defpackage.w0
    public final Object f() {
        return new ArrayList();
    }

    @Override // defpackage.w0
    public final int g(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.w0
    public final Iterator h(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new b2(objArr);
    }

    @Override // defpackage.w0
    public final int i(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.w0
    public final Object l(Object obj) {
        throw null;
    }

    @Override // defpackage.w0
    public final Object m(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object newInstance = Array.newInstance(nmd.B(this.b), arrayList.size());
        newInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) newInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.ql1
    public final void n(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
