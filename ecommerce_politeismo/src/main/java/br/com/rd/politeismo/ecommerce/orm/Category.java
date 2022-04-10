
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import br.com.rd.politeismo.ecommerce.orm.Department;
import br.com.rd.politeismo.ecommerce.orm.Product;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String description;

	@Column(name = "fl_inactive")
	private boolean flInactive = true; // flag inactive

	private List<Department> departament;
	private List<Product> product;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Department> getDepartament() {
		return departament;
	}

	public List<Product> getProduct() {
		return product;
	}

	@Override
	public String toString() {
		return "Category [ID: " + id + ", Description: " + description + "]";
	}

}
