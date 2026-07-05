package org.mozilla.javascript;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class SpecialRef extends Ref {
    private static final int SPECIAL_NONE = 0;
    private static final int SPECIAL_PARENT = 2;
    private static final int SPECIAL_PROTO = 1;
    private static final long serialVersionUID = -7521596632456797847L;
    private String name;
    private Scriptable target;
    private int type;

    private SpecialRef(Scriptable scriptable, int i, String str) {
        this.target = scriptable;
        this.type = i;
        this.name = str;
    }

    public static Ref createSpecial(Context context, Scriptable scriptable, Object obj, String str) {
        int i;
        Scriptable objectOrNull = ScriptRuntime.toObjectOrNull(context, obj, scriptable);
        if (objectOrNull != null) {
            if (str.equals("__proto__")) {
                i = 1;
            } else if (str.equals("__parent__")) {
                i = 2;
            } else {
                vs.m(str);
                return null;
            }
            if (!context.hasFeature(5)) {
                i = 0;
            }
            return new SpecialRef(objectOrNull, i, str);
        }
        throw ScriptRuntime.undefReadError(obj, str);
    }

    @Override // org.mozilla.javascript.Ref
    public boolean delete(Context context) {
        if (this.type == 0) {
            return ScriptRuntime.deleteObjectElem(this.target, this.name, context);
        }
        return false;
    }

    @Override // org.mozilla.javascript.Ref
    public Object get(Context context) {
        int i = this.type;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.target.getParentScope();
                }
                throw Kit.codeBug();
            }
            return this.target.getPrototype();
        }
        return ScriptRuntime.getObjectProp(this.target, this.name, context);
    }

    @Override // org.mozilla.javascript.Ref
    public boolean has(Context context) {
        if (this.type == 0) {
            return ScriptRuntime.hasObjectElem(this.target, this.name, context);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    @Override // org.mozilla.javascript.Ref
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object set(org.mozilla.javascript.Context r4, org.mozilla.javascript.Scriptable r5, java.lang.Object r6) {
        /*
            r3 = this;
            int r0 = r3.type
            if (r0 == 0) goto Lc3
            r1 = 1
            if (r0 == r1) goto L10
            r2 = 2
            if (r0 != r2) goto Lb
            goto L10
        Lb:
            java.lang.RuntimeException r3 = org.mozilla.javascript.Kit.codeBug()
            throw r3
        L10:
            org.mozilla.javascript.Scriptable r5 = org.mozilla.javascript.ScriptRuntime.toObjectOrNull(r4, r6, r5)
            if (r5 == 0) goto L38
            r0 = r5
        L17:
            org.mozilla.javascript.Scriptable r2 = r3.target
            if (r0 == r2) goto L2b
            int r2 = r3.type
            if (r2 != r1) goto L24
            org.mozilla.javascript.Scriptable r0 = r0.getPrototype()
            goto L28
        L24:
            org.mozilla.javascript.Scriptable r0 = r0.getParentScope()
        L28:
            if (r0 != 0) goto L17
            goto L38
        L2b:
            java.lang.String r3 = r3.name
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "msg.cyclic.value"
            org.mozilla.javascript.EvaluatorException r3 = org.mozilla.javascript.Context.reportRuntimeErrorById(r4, r3)
            throw r3
        L38:
            int r0 = r3.type
            org.mozilla.javascript.Scriptable r2 = r3.target
            if (r0 != r1) goto Lbf
            boolean r0 = r2 instanceof org.mozilla.javascript.ScriptableObject
            if (r0 == 0) goto L5d
            org.mozilla.javascript.ScriptableObject r2 = (org.mozilla.javascript.ScriptableObject) r2
            boolean r0 = r2.isExtensible()
            if (r0 != 0) goto L5d
            int r0 = r4.getLanguageVersion()
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 >= r1) goto L53
            goto L5d
        L53:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "msg.not.extensible"
            org.mozilla.javascript.EcmaError r3 = org.mozilla.javascript.ScriptRuntime.typeErrorById(r4, r3)
            throw r3
        L5d:
            int r4 = r4.getLanguageVersion()
            org.mozilla.javascript.Scriptable r0 = r3.target
            r1 = 200(0xc8, float:2.8E-43)
            if (r4 < r1) goto Lbb
            java.lang.String r4 = org.mozilla.javascript.ScriptRuntime.typeof(r0)
            java.lang.String r0 = "function"
            boolean r1 = r0.equals(r4)
            java.lang.String r2 = "object"
            if (r1 == 0) goto L97
            if (r6 != 0) goto L7f
            org.mozilla.javascript.Scriptable r3 = r3.target
            org.mozilla.javascript.Scriptable r4 = org.mozilla.javascript.Undefined.SCRIPTABLE_UNDEFINED
            r3.setPrototype(r4)
            return r6
        L7f:
            java.lang.String r4 = org.mozilla.javascript.ScriptRuntime.typeof(r6)
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L91
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L90
            goto L91
        L90:
            return r6
        L91:
            org.mozilla.javascript.Scriptable r3 = r3.target
            r3.setPrototype(r5)
            return r6
        L97:
            java.lang.String r0 = org.mozilla.javascript.ScriptRuntime.typeof(r6)
            java.lang.String r1 = "symbol"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto La4
            return r6
        La4:
            if (r6 == 0) goto Lac
            boolean r6 = r2.equals(r0)
            if (r6 == 0) goto Lb2
        Lac:
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto Lb5
        Lb2:
            java.lang.Object r3 = org.mozilla.javascript.Undefined.instance
            return r3
        Lb5:
            org.mozilla.javascript.Scriptable r3 = r3.target
            r3.setPrototype(r5)
            return r5
        Lbb:
            r0.setPrototype(r5)
            return r5
        Lbf:
            r2.setParentScope(r5)
            return r5
        Lc3:
            org.mozilla.javascript.Scriptable r5 = r3.target
            java.lang.String r3 = r3.name
            java.lang.Object r3 = org.mozilla.javascript.ScriptRuntime.setObjectProp(r5, r3, r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.SpecialRef.set(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, java.lang.Object):java.lang.Object");
    }

    @Override // org.mozilla.javascript.Ref
    @Deprecated
    public Object set(Context context, Object obj) {
        throw new IllegalStateException();
    }
}
