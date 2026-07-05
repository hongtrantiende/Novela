package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bab  reason: default package */
/* loaded from: classes.dex */
public final class bab extends uq7 {
    public final Object b;
    public final Object c;
    public final Object[] d;
    public final PointerInputEventHandler e;

    public bab(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
        this.e = pointerInputEventHandler;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new hab(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "key1");
        c00Var.b(this.c, "key2");
        c00Var.b(this.d, "keys");
        c00Var.b(this.e, "pointerInputEventHandler");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        hab habVar = (hab) mq7Var;
        Object obj = habVar.K;
        Object obj2 = this.b;
        boolean z = true;
        boolean z2 = !c16.i(obj, obj2);
        habVar.K = obj2;
        Object obj3 = habVar.L;
        Object obj4 = this.c;
        if (!c16.i(obj3, obj4)) {
            z2 = true;
        }
        habVar.L = obj4;
        Object[] objArr = habVar.M;
        Object[] objArr2 = this.d;
        if (objArr != null && objArr2 == null) {
            z2 = true;
        }
        if (objArr == null && objArr2 != null) {
            z2 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z2 = true;
        }
        habVar.M = objArr2;
        Class<?> cls = habVar.N.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.e;
        if (cls == pointerInputEventHandler.getClass()) {
            z = z2;
        }
        if (z) {
            habVar.J1();
        }
        habVar.N = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bab)) {
            return false;
        }
        bab babVar = (bab) obj;
        if (!c16.i(this.b, babVar.b) || !c16.i(this.c, babVar.c)) {
            return false;
        }
        Object[] objArr = babVar.d;
        Object[] objArr2 = this.d;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        if (this.e == babVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        Object obj = this.b;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Object obj2 = this.c;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Object[] objArr = this.d;
        if (objArr != null) {
            i3 = Arrays.hashCode(objArr);
        }
        return this.e.hashCode() + ((i5 + i3) * 31);
    }
}
