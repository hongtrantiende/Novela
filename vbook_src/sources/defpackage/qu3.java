package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qu3  reason: default package */
/* loaded from: classes3.dex */
public final class qu3 extends e2 implements pu3, RandomAccess, Serializable {
    public final Enum[] a;

    public qu3(Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
    }

    @Override // defpackage.v0
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.v0, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        if (((Enum) b00.q0(r3.ordinal(), this.a)) != r3) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        cy7.k(rs8.k("index: ", i, length, ", size: "));
        return null;
    }

    @Override // defpackage.e2, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) b00.q0(ordinal, this.a)) != r3) {
            return -1;
        }
        return ordinal;
    }

    @Override // defpackage.e2, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) b00.q0(ordinal, this.a)) != r3) {
            return -1;
        }
        return ordinal;
    }
}
