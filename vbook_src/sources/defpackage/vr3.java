package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vr3  reason: default package */
/* loaded from: classes.dex */
public final class vr3 extends hxe {
    public final lw j;
    public final kq3 k;
    public boolean l = true;

    public vr3(lw lwVar) {
        this.j = lwVar;
        this.k = new kq3(lwVar);
    }

    public final void B() {
        lw lwVar = this.j;
        TransformationMethod transformationMethod = lwVar.getTransformationMethod();
        if (this.l) {
            if (!(transformationMethod instanceof zr3) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new zr3(transformationMethod);
            }
        } else if (transformationMethod instanceof zr3) {
            transformationMethod = ((zr3) transformationMethod).a;
        }
        lwVar.setTransformationMethod(transformationMethod);
    }

    @Override // defpackage.hxe
    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        if (!this.l) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof kq3) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            kq3 kq3Var = this.k;
            if (i4 < length2) {
                if (inputFilterArr[i4] == kq3Var) {
                    return inputFilterArr;
                }
                i4++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = kq3Var;
                return inputFilterArr3;
            }
        }
    }

    @Override // defpackage.hxe
    public final void w(boolean z) {
        if (z) {
            B();
        }
    }

    @Override // defpackage.hxe
    public final void x(boolean z) {
        this.l = z;
        B();
        lw lwVar = this.j;
        lwVar.setFilters(l(lwVar.getFilters()));
    }
}
