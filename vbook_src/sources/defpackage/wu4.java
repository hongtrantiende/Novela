package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wu4  reason: default package */
/* loaded from: classes3.dex */
public abstract class wu4 extends l51 implements vu4, i76 {
    private final int arity;

    public wu4(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.l51
    public u66 computeReflected() {
        cm9.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wu4) {
            wu4 wu4Var = (wu4) obj;
            if (getName().equals(wu4Var.getName()) && getSignature().equals(wu4Var.getSignature()) && c16.i(getBoundReceiver(), wu4Var.getBoundReceiver()) && c16.i(getOwner(), wu4Var.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof i76)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override // defpackage.vu4
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.l51
    public i76 getReflected() {
        u66 compute = compute();
        if (compute != this) {
            return (i76) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // defpackage.i76
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.i76
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.i76
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.i76
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.i76
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        u66 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
