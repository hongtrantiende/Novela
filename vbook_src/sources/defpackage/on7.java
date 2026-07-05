package defpackage;

import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: on7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class on7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt4 b;

    public /* synthetic */ on7(int i, vt4 vt4Var) {
        this.a = i;
        this.b = vt4Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        float f = 1.0f;
        float f2 = nae.e;
        pvc pvcVar = pvc.a;
        vt4 vt4Var = this.b;
        switch (i) {
            case 0:
                vt4Var.invoke();
                return pvcVar;
            case 1:
                vt4Var.invoke();
                return pvcVar;
            case 2:
                vt4Var.invoke();
                return pvcVar;
            case 3:
                vt4Var.invoke();
                return pvcVar;
            case 4:
                vt4Var.invoke();
                return pvcVar;
            case 5:
                vt4Var.invoke();
                return pvcVar;
            case 6:
                vt4Var.invoke();
                return pvcVar;
            case 7:
                vt4Var.invoke();
                return pvcVar;
            case 8:
                vt4Var.invoke();
                return pvcVar;
            case 9:
                vt4Var.invoke();
                return pvcVar;
            case 10:
                vt4Var.invoke();
                return pvcVar;
            case 11:
                vt4Var.invoke();
                return pvcVar;
            case 12:
                vt4Var.invoke();
                return pvcVar;
            case 13:
                vt4Var.invoke();
                return pvcVar;
            case 14:
                vt4Var.invoke();
                return pvcVar;
            case 15:
                vt4Var.invoke();
                return pvcVar;
            case 16:
                vt4Var.invoke();
                return pvcVar;
            case 17:
                vt4Var.invoke();
                return pvcVar;
            case 18:
                vt4Var.invoke();
                return pvcVar;
            case 19:
                vt4Var.invoke();
                return pvcVar;
            case 20:
                vt4Var.invoke();
                return pvcVar;
            case 21:
                vt4Var.invoke();
                return pvcVar;
            case 22:
                File file = (File) vt4Var.invoke();
                file.getClass();
                String name = file.getName();
                name.getClass();
                if (k4b.E0('.', name, "").equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    absoluteFile.getClass();
                    return absoluteFile;
                }
                vm1.e(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                return null;
            case 23:
                float floatValue = ((Number) vt4Var.invoke()).floatValue();
                if (floatValue >= nae.e) {
                    f2 = floatValue;
                }
                if (f2 <= 1.0f) {
                    f = f2;
                }
                return Float.valueOf(f);
            case 24:
                float floatValue2 = ((Number) vt4Var.invoke()).floatValue();
                if (floatValue2 >= nae.e) {
                    f2 = floatValue2;
                }
                if (f2 <= 1.0f) {
                    f = f2;
                }
                return Float.valueOf(f);
            case 25:
                vt4Var.invoke();
                return pvcVar;
            case 26:
                vt4Var.invoke();
                return pvcVar;
            case 27:
                vt4Var.invoke();
                return pvcVar;
            case 28:
                Boolean bool = (Boolean) vt4Var.invoke();
                bool.booleanValue();
                return bool;
            default:
                vt4Var.invoke();
                return pvcVar;
        }
    }
}
