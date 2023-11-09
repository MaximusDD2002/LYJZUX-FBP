yieldUnescaped '<!DOCTYPE html>'
html(lang:'en') {
	body {
		div {
			h1 { yield 'Index' }
		}

		div {
			a (href: '/employees') {
				button {
					yield 'employees'
				}
			}
		}

		div {
			a (href: '/employees/{id}') {
				button {
					yield 'id'
				}
			}
		}

		div {
			a (href: '/secret') {
				button {
					yield 'secret'
				}
			}
		}
	}
}
