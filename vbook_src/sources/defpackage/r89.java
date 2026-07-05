package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r89  reason: default package */
/* loaded from: classes3.dex */
public abstract class r89 extends l51 implements r76 {
    public final boolean a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r89(java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r9 = this;
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Ld
            r8 = r2
        L7:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            goto Lf
        Ld:
            r8 = r1
            goto L7
        Lf:
            r3.<init>(r4, r5, r6, r7, r8)
            r9 = 2
            r10 = r14 & 2
            if (r10 != r9) goto L18
            r1 = r2
        L18:
            r3.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r89.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // defpackage.l51
    public final u66 compute() {
        if (this.a) {
            return this;
        }
        return super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r89) {
            r89 r89Var = (r89) obj;
            if (getOwner().equals(r89Var.getOwner()) && getName().equals(r89Var.getName()) && getSignature().equals(r89Var.getSignature()) && c16.i(getBoundReceiver(), r89Var.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof r76)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override // defpackage.l51
    /* renamed from: f */
    public final r76 getReflected() {
        if (!this.a) {
            u66 compute = compute();
            if (compute != this) {
                return (r76) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        xk5.q("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        u66 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
