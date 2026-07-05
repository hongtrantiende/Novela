package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nj extends xu4 implements xt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(cl6 cl6Var) {
        super(1, b16.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.b = cl6Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                float[] fArr = ((l27) obj).a;
                sc6 sc6Var = (sc6) ((cl6) obj2).N.getValue();
                if (sc6Var != null) {
                    if (!sc6Var.t()) {
                        sc6Var = null;
                    }
                    if (sc6Var != null) {
                        sc6Var.z(fArr);
                    }
                }
                return pvcVar;
            default:
                int intValue = ((Number) obj).intValue();
                aw7 aw7Var = (aw7) obj2;
                String str = ((jub) aw7Var.getValue()).a.b;
                if (str.length() != 0) {
                    String s = lh9.s(intValue, str);
                    int length = s.length();
                    aw7Var.setValue(new jub(s, sze.a(length, length), 4));
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(aw7 aw7Var) {
        super(1, b16.class, "applyCapitalize", "ModalNEREdit$applyCapitalize(Landroidx/compose/runtime/MutableState;I)V", 0);
        this.b = aw7Var;
    }
}
